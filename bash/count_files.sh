#!/bin/bash
echo "Archivos en el directorio actual:"
ls -1 | wc -l

echo "Archivos en subdirectorios:"
find . -type f | wc -l
