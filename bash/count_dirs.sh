#!/bin/bash
echo "Directorios en el directorio actual:"
find . -type d | wc -l

echo "Directorios en /etc (puede variar):"
find /etc -type d | wc -l
