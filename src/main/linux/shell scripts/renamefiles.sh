#!/bin/bash
PICTURES=$(ls *jpg)
DATE=$(date +%F)

for PICTURE in $PICTURES
do
   echo "renaming ${PICTURE} to ${DATE}-${PICTURE}"
   mv ${PICTURE} ${DATE}-${PICTURE}
done
