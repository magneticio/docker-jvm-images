#!/usr/bin/env bash

VERSION=5
docker build -t magneticio/java:sbt-builder_$VERSION .
docker push magneticio/java:sbt-builder_$VERSION
