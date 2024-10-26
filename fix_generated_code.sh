#!/bin/sh
# Replace incorrect generic type syntax
find target/generated-sources/openapi/src/main/java -type f -name "*.java" -exec sed -i 's/import javax/import jakarta/g' {} +
find target/generated-sources/openapi/src/main/java -type f -name "*.java" -exec sed -i 's/@javax.annotation./@jakarta.annotation./g' {} +