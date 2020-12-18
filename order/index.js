const fastify = require('fastify')({logger: true})
const configuration = require('./config.json')

fastify.get('/', (request, reply) => {
  reply.send(configuration)
})

fastify.listen(9877, (err, address) => {
  if (err) {
    fastify.log.error(err)
    process.exit(1)
  }
  fastify.log.info(`server listening on ${address}`)
})