# Guia de CuentaElementos

## Objetivo
Aprender a contar archivos, directorios y medir el uso del disco con comandos Linux.

## Flujo recomendado
1. Abre `index.html`.
2. Revisa las tarjetas de comandos.
3. Ejecuta los scripts de `bash/` en Linux o WSL.

## Ejemplos paso a paso
- `ls -1 | wc -l` cuenta elementos visibles en el directorio actual.
- `find . -type f | wc -l` cuenta todos los archivos.
- `du -sh .` muestra el peso total de la carpeta.
- `df -h` muestra el espacio libre por particion.

## Resultado esperado
Ser capaz de analizar rapidamente el numero de elementos y el uso de disco en un sistema Linux.
