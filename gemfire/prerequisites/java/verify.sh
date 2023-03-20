#!/bin/bash

echo "verify java"
java -version

echo "verify JAVA_HOME"
[[ ! -z "${JAVA_HOME}" ]]
