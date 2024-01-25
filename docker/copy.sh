#!/bin/sh

usage() {
	echo "Usage: sh copy.sh"
	exit 1
}

# copy jar
echo "begin copy cas-module-access "
cp ../cas-modules/cas-module-access/target/cas-module-access.jar ./cas/access/jar