#!/usr/bin/env bash

VERSION=4
docker build -t magneticio/java:sbt-builder_$VERSION .
docker push magneticio/java:sbt-builder_$VERSION
