# Add Data to Regions with client


Adding data using a cli isn't the only way that we can enter data into a region. There are a lot of ways,
one of the more popular is to use a GemFire client. We just so happen to have a small client application here. 

```plain
cat /root/client.java
```{{exec}}

Should be simple enough, we just connect to the cluster and insert some data. Let's run it. 

```plain
javac /root/client.java && java Client
```{{exec}}




