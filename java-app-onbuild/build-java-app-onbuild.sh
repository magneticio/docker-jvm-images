#!/usr/bin/env bash

VERSION=3
docker build -t magneticio/java:java-app-onbuild_$VERSION .
docker push magneticio/java:java-app-onbuild_$VERSION
