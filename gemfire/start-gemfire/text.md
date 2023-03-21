# start gemfire

Now that GemFire is installed, we can create a cluster and do all kinds of things with it. 

First, let's create the cluster. A cluster contains at least one locator and one server. Their 
responsibilities aren't important right now, but we will need to start both in order to do what we want. 

Starting them is really simple and can be done in one line. 
```plain
./gemfire/bin/gfsh -e 'start locator --name=locator' -e 'start server --name=server'
```{{exec}}

And that's it! We have a running cluster.

Let's make sure the cluster looks ok
```plain
./gemfire/bin/gfsh -e 'connect --name=locator' -e 'list members'
```{{exec}}

You should see some output similar to:

```
Member Count : 2

Name   | Id
------- | -------------------------------------------------------------------
locator | test-javaclient(locator:532579:locator)<ec><v0>:41000 [Coordinator]
server | test-javaclient(server:534075)<v1>:41001
```