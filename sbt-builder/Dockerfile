FROM openjdk:8u141

# Env variables
ENV SCALA_VERSION 2.12.4
ENV SBT_VERSION 0.13.16

# Scala expects this file
RUN touch /usr/lib/jvm/java-8-openjdk-amd64/release

# Install Scala
## Piping curl directly in tar
RUN \
  curl -fsL https://downloads.typesafe.com/scala/$SCALA_VERSION/scala-$SCALA_VERSION.tgz | tar xfz - -C /root/ && \
  echo >> /root/.bashrc && \
  echo "export PATH=~/scala-$SCALA_VERSION/bin:$PATH" >> /root/.bashrc

# Install sbt
RUN \
  curl -L -o sbt-$SBT_VERSION.deb https://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion

# install docker client for comminication to host:
# docker run -it -v /var/run/docker.sock:/var/run/docker.sock sbt-base
ENV DOCKER_VERSION 17.09.0
RUN curl -fsSLO https://download.docker.com/linux/static/stable/x86_64/docker-$DOCKER_VERSION-ce.tgz \
  && tar xzvf docker-$DOCKER_VERSION-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-$DOCKER_VERSION-ce.tgz

ADD mock /mock
RUN cd /mock && sbt update && rm -rf /mock
# Define working directory
VOLUME /src
WORKDIR /src

ONBUILD ADD ./project/build.properties ./project/plugins.sbt /src/project/
ONBUILD ADD ./build.sbt ./scalastyle-config.xml /src/
ONBUILD ARG SBT_REPO_USERNAME
ONBUILD ARG SBT_REPO_PASSWORD
ONBUILD RUN sbt update
ONBUILD ADD ./src /src/src
ONBUILD RUN sbt clean assembly && mkdir /app && cp target/App.jar /app
