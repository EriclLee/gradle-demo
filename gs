#!/usr/bin/env bash -e
# build before push
if [ $1 == 'push' ] ; then
  ./gradlew clean build
fi

git "$@"
