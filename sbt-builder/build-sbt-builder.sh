#!/usr/bin/env bash

VERSION=3
docker build -t magneticio/java:sbt-builder_$VERSION .
docker push magneticio/java:sbt-builder_$VERSION
