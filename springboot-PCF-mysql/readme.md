####  Url

	GET:
	
	http://localhost:8080/employees
	
	https://sb-pcf-mysql-vikas-111.cfapps.io/employees
	
#### PCF Deployment
	In Cloud Foundry, services are on demand resources that users can provision and use for their deployed application.
	Examples of resources services provide include databases on a shared or dedicated server, or accounts on a SaaS application. 	These resources are known as service instances and the systems that deliver and 	operate these resources are known as 	Services. Think of a service as a factory that delivers service instances.

	Services can either be
	User Defined Service
	MarketPlace Service

	For this example we will be needing the MySQL MarketPlace service.
	
### Provisioning MySql Service using PCF Web Console

-https://login.run.pivotal.io/login

-Login to Pivotal Cloud Foundry with your credentials
	
-Go to Pivotal Services tab for our development space

-Click on Add New Service and type MySQL

### manifest.yml

			applications:
			- name: springboot-PCF-mysql
			  disk_quota: 1G
			  instances: 1
			  memory: 1G
			  path: target/springboot-PCF-mysql-0.0.1-SNAPSHOT.jar
			  timeout: 120
			  routes:
			  - route: sb-pcf-mysql-vikas-111.cfapps.io
			  stack: cflinuxfs3
			services:
			  - sqldb



