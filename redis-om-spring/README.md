# Redis OM Spring

- from: https://github.com/redis/redis-om-spring
- branched off upstream tag v0.6.4 and modified to compile to Java 8
- must use javac 11 to compile
- tests have not been converted to Java8 code as it's too time consuming
- "delombok" was required to make the project compile under Java 8, otherwise the lombok annotations weren't working