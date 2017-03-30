# CoolStore Monolith

This repository has the complete coolstore monolith built as a Java EE 7 application. To deploy it on OpenShift Container Platform (OCP) follow the instructions below



Build the project using openshift profile (use --offine if you downloaded the dependencies)

    mvn -Popenshift package

Create a new project (or use an existing)

    oc new-project monolith

Create the app

    oc process -f src/main/openshift/template.json | oc create -f -

Give the service account the possibility to view your project (needed for clustering to work)

    oc policy add-role-to-user view system:serviceaccount:$(oc project -q):coolstore-serviceaccount -n $(oc project -q)

Start the build

    oc start-build coolstore --from-file=deployments/ROOT.war

Download dependencies (Not required, but speeds up the build)

    mvn assembly:help compiler:help enforcer:help exec:help failsafe:help \
        install:help jar:help resources:help surefire:help war:help wildfly:help
    
    mvn dependency:go-offline
    



 