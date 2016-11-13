#!/usr/bin/env bash -e
gradle build
git add .
git commit -m "ddd"
git push origin master
