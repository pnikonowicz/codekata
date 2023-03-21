# Start GemFire

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
./gemfire/bin/gfsh -e 'connect' -e 'list members'
```{{exec}}

You should see some output similar to:

```
Member Count : 2

Name   | Id
------- | -------------------------------------------------------------
locator | 172.30.1.2(locator:25006:locator)<ec><v0>:41000 [Coordinator]
server  | 172.30.1.2(server:25152)<v1>:41001
```