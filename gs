#!/usr/bin/env bash -e
if [ $1 == 'push' ] ; then
  ./gradlew build
fi

for i in $*; do
echo $i
done

git "$@"
