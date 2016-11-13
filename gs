#!/usr/bin/env bash -e
if [ $1 == 'push' ] ; then
  ./gradlew build
fi
git $*
