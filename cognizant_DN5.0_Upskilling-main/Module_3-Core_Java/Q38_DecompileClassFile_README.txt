== Decompile a Class File ==

Steps:
1. Compile: javac HelloWorld.java  -> HelloWorld.class
2. CFR (CLI): java -jar cfr.jar HelloWorld.class
   JD-GUI: File > Open > select .class file

Notes:
- Variable names may differ (var1, var2...)
- Lambdas may appear as anonymous inner classes
- Comments are stripped from bytecode

Download CFR:    https://github.com/leibnitz27/cfr/releases
Download JD-GUI: http://java-decompiler.github.io
