#!/usr/bin/env bash
# Use `min` to generate a template with a different package name
# to create multiple minimal cheats may be installed.
#
# Usage:
#
#     ./template.sh NewName
#
set -ex
# http://stackoverflow.com/questions/28795479/awk-sed-script-to-convert-a-file-from-camelcase-to-underscores
underscore="$(echo "$1" | sed -r -e 's/([a-z0-9])([A-Z])/\1_\L\2/g' -e 's/([A-Z])/\L\1/')" 
cp -r 'min/' "$underscore"
cd "$underscore"
find . -type f -print0 | xargs -0 sed -i "s/\.min/.$underscore/g"
find . -type f -print0 | xargs -0 sed -i "s/\Min/$1/g"
cd 'src/com/cirosantilli/android_cheat'
mv min "$underscore"
