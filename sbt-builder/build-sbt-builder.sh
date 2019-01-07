#!/usr/bin/env bash

VERSION=2
docker build -t magneticio/java:sbt-builder_$VERSION .
docker push magneticio/java:sbt-builder_$VERSION
