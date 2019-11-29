// Comment to get more information during initialization
logLevel := Level.Warn

addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "5.0.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.3")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.3")

//run "sbt dependencyTree" to display graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

