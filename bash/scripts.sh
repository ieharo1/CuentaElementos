#!/bin/bash
# Script maestro para ejecutar los ejemplos del laboratorio.

set -e

echo "Conteo de archivos y directorios"
bash "$(dirname "$0")/count_files.sh"
bash "$(dirname "$0")/count_dirs.sh"

echo ""
echo "Uso de disco"
bash "$(dirname "$0")/disk_usage.sh"
