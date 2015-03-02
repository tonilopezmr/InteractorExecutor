# InteractorExecutor [![Build Status](https://travis-ci.org/tonilopezmr/InteractorExecutor.svg?branch=master)](https://travis-ci.org/tonilopezmr/InteractorExecutor) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.tonilopezmr/interactorexecutor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.tonilopezmr/interactorexecutor) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-InteractorExecutor-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1591)

InteractorExecutor is a small Android library using the Interactor(use case) and Executor for running code on a Thread Pool Thread or UI Thread. Normally this library is used for implement the Clean Architecture.

For learn how to use this library read this [awesome article][12] and see the sample code.



Import InteractorExecutor dependency:
-----------------------------

Grab via maven:

```xml
<dependency>
  <groupId>com.github.tonilopezmr</groupId>
  <artifactId>interactorexecutor</artifactId>
  <version>1.0</version>
</dependency>
```

or gradle:

```gradle
compile 'com.github.tonilopezmr:interactorexecutor:1.0'
````


Sample Clean architecture
-------------------------
The code which uses this library is in the package `'com.tonilopezmr.sample.domain.interactor'`.

The sample code is the sames as my other library [Android EasySQLite][11].

I use the Clean architecture with the pattern MVP, I have been motivated for the speaker [pedrovgs][10] in DroidCon 2014.

After see the MVP implementations of:

* [MVPCleanArchitecture][6] by [glmoadrian][5]
* [EffectiveAndroidUI][7] by [pedrovgs][4]
* [Android-CleanArchitecture][8] by [android10][9] 


Libraries used on the sample project
------------------------------------

* [Dagger][1]
* [Butterknife][2]
* [FloatingActionButton][3]

If anything is wrong contact me
-------------------------------------------

* Antonio López Marín - <tonilopezmr@gmail.com>

<a href="https://twitter.com/tonilz">
  <img alt="Follow me on Twitter" src="https://cdn3.iconfinder.com/data/icons/free-social-icons/67/twitter_circle_black-128.png" width="60" height="60"/>
</a>
<a href="http://www.linkedin.com/in/tonilopezmr">
  <img alt="Add me to Linkedin" src="https://cdn3.iconfinder.com/data/icons/free-social-icons/67/linkedin_circle_black-128.png" width="60" height="60"/>
</a>


License
-------

    Copyright 2015 Antonio López Marín <tonilopezmr.com>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[1]: https://github.com/square/dagger
[2]: https://github.com/JakeWharton/butterknife
[3]: https://github.com/makovkastar/FloatingActionButton
[4]: https://github.com/pedrovgs
[5]: https://github.com/glomadrian
[6]: https://github.com/glomadrian/MvpCleanArchitecture
[7]: https://github.com/pedrovgs/EffectiveAndroidUI
[8]: https://github.com/android10/Android-CleanArchitecture
[9]: https://github.com/android10
[10]: http://www.slideshare.net/PedroVicenteGmezSnch/effective-android-ui-english
[11]: https://github.com/tonilopezmr/Android-EasySQLite
[12]: http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/