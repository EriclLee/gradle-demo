#!/usr/bin/env bash -e
gradle build
git add .
git commit -m "test"
git push origin master
