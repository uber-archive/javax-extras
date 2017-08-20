# javax-extras

Extra utilities for javax

## Why a separate artifact?

Aside from reuse - the recommend scope to use this library in is `compileOnly` or `provided`. 
Modern tooling will recognize annotations in bytecode, and allows you to depend on this in a way 
that allows tooling to leverage it without bundling it as a part of your library/API.

Related reading: https://medium.com/square-corner-blog/non-null-is-the-default-58ffc0bb9111

## What's available?

#### EverythingIsNonNullByDefault

The nuclear option: Everything is NonNull by default. 
This includes method fields, method return types, method parameters, and local variables.

#### FieldsMethodsAndParametersAreNonNullByDefault

This includes fields, method return types, and method parameters.

#### FieldsMethodsAndParametersAreNonNullByDefault

This includes fields, method return types, and method parameters.

#### MethodsAndParametersAreNonNullByDefault

This includes method return types and method parameters.

#### ParametersAreNonnullByDefault

Is already in the jsr305 findbugs package this depends on. Use it :)

#### Others

We're open to suggestions! Feel free to open an issue or propose in a PR.

Download
--------

[![Maven Central](https://img.shields.io/maven-central/v/com.uber.javaxextras/javax-extras.svg)](https://mvnrepository.com/artifact/com.uber.javaxextras/javax-extras)
```gradle
compileOnly 'com.uber.javaxextras:javax-extras:x.y.z'
```

Snapshots of the development version will eventually be available in [Sonatype's snapshots repository][snapshots].

License
-------

    Copyright (C) 2017 Uber Technologies

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 [snapshots]: https://oss.sonatype.org/content/repositories/snapshots/
