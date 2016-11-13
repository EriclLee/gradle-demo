#!/usr/bin/env bash -e
if [ $1 == 'push' ] ; then
   gradle build
fi
git push origin master
