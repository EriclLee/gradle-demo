#!/usr/bin/env bash -e
if [ $1 == 'push' ] ; then
  ./gradlew clean build
fi

git "$@"
