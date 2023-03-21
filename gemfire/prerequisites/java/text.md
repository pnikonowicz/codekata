# Install Java

First we will install java 8. We could use other versions, but java 8 works just fine.

<br>

```plain
apt install -y openjdk-8-jre-headless
```{{exec}}

And set the JAVA_HOME environment variable

```plain
export JAVA_HOME='/usr/lib/jvm/java-8-openjdk-amd64'
```{{exec}}

Then verify everything looks ok
```plain
echo "verify java"
java -version

echo "verify JAVA_HOME"
[[ ! -z "${JAVA_HOME}" ]] || echo "JAVA_HOME not set"
```{{exec}}