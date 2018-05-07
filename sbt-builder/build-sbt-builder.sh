#!/usr/bin/env bash

VERSION=1
docker build -t magneticio/java:sbt-builder_$VERSION .
docker push magneticio/java:sbt-builder_$VERSION
