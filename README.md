SortTool(Java)
=====================
[![Build Status](https://travis-ci.org/szpssky/sort-tool.svg?branch=master)](https://travis-ci.org/szpssky/sort-tool)
[![Maven Central](https://img.shields.io/badge/maven--center-1.0-green.svg)](http://search.maven.org/#artifactdetails%7Ccom.tifosi-m%7Csort-tool%7C1.0%7Cjar)
[![codecov](https://codecov.io/gh/szpssky/sort-tool/branch/master/graph/badge.svg)](https://codecov.io/gh/szpssky/sort-tool)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/02a084c212894a3e913acb36046f0be5)](https://www.codacy.com/app/szplss31012/sort-tool?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=szpssky/sort-tool&amp;utm_campaign=Badge_Grade)
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## Overview

This is Sort Algorithm tool,you can easy to use many sort algorithm.

About Sort Algorithm introduction see the [ALGORITHM_WIKI](ALGORITHM_WIKI.md). 

|Support|
|:-----:|
|Bubble Sort|
|Selection Sort|
|Merge Sort|
|Quick Sort|
|Shell Sort|
|Heap Sort|
|Cocktail Sort|
|Gnome Sort|
|Comb Sort|

## Quick Start

Add maven dependency

``` xml
<dependency>
  <groupId>com.tifosi-m</groupId>
  <artifactId>sort-tool</artifactId>
  <version>1.0</version>
</dependency>
```

Or Download [sort-algorithm.jar](https://github.com/szpssky/sort-algorithm/releases)

``` java
import com.tifosi.tool.sort.*;


Sort<Integer> quickSort = new QuickSort<Integer>(array);
quick.sort();
```
Enjoy It!