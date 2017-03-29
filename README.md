# CoolStore Monolith

This repository has the complete coolstore monolith built as a Java EE 7 application. To deploy it on OpenShift Container Platform (OCP) follow the instructions below



Build the project using openshift profile (use --offine if you downloaded the dependencies)

    mvn -Popenshift package

Create a new project (or use an existing)

    oc new-project monolith

Create the build in OCP

    oc new-build --name=coolstore openshift/jboss-eap70-openshift --binary

Create the app

    oc new-app coolstore --allow-missing-imagestream-tags

Create the service

    oc expose dc coolstore --port=8080

Creata a route to the service

    oc expose svc coolstore

Start the build

    oc start-build coolstore --from-file=deployments/ROOT.war
    

Download dependencies (Not required, but speeds up the build)

    mvn dependency:go-offline
    

 