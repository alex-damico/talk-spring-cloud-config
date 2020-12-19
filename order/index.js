const fastify = require('fastify')({logger: true})
const configuration = require('./config.json')

const commander = require('commander')
commander.option('-p, --profiles <dev>', 'Profiles', 'dev').parse()

const client = require('cloud-config-client')
const options = {
  endpoint: 'http://localhost:9879',
  name: 'order',
  profiles: commander.profiles
}

fastify.get('/', (request, reply) => {
  client.load(options)
  .then((cfg) => {
    reply.send(cfg.toObject())
  }).catch(() => {
    reply.send(configuration)
  })
})

fastify.listen(9877, (err, address) => {
  if (err) {
    fastify.log.error(err)
    process.exit(1)
  }
  fastify.log.info(`server listening on ${address}`)
})