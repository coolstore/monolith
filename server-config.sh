CWD=$(dirname $0)
#$JBOSS_HOME/bin/add-user.sh -a -u 'thomas' -p 'thomas' -g 'admin,user'
#$JBOSS_HOME/bin/add-user.sh -a -u 'syed' -p 'syed' -g 'user'
#$JBOSS_HOME/bin/add-user.sh -a -u 'james' -p 'james' -g 'user'
#$JBOSS_HOME/bin/add-user.sh -a -u 'cesar' -p 'cesar' -g 'user'

$JBOSS_HOME/bin/jboss-cli.sh --file=$JBOSS_HOME/docs/examples/enable-elytron.cli --echo-command

$JBOSS_HOME/bin/jboss-cli.sh --file=${CWD}/server-config.cli --echo-command
#$JBOSS_HOME/bin/jboss-cli.sh --file=${CWD}/security-config.cli --echo-command