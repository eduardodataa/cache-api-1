Aplicação teste para uso básico do Redis e Cache via annotation Spring

- Redis: utilizando em máquina Windows via Ubunto por WSL2
- Link de instalação: https://redis.io/docs/getting-started/installation/install-redis-on-windows/

Verificar dados no Redis via console:

 - redis-cli
 - KEYS *.  
	- resultado: 1) "hello::SimpleKey []"
 - get "hello::SimpleKey []"  
	- resultado: "\xac\xed\x00\x05t\x00\x0cHello World2"
 - "hello::SimpleKey []"  
	- resultado: (empty array)
