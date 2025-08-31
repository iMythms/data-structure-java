# Data Structure Java Course

This repository contains Java programs and exercises from a college Data Structures course. Each Lab folder represents a lesson or assignment covering topics such as arrays, linked lists, stacks, queues, sorting algorithms, and binary search trees.

## What's new

- Added `index.html` — a self-contained Reveal.js slide deck that turns this repository's examples into teaching material. Open `index.html` in a browser (recommend using a local static server such as VSCode Live Server or `python -m http.server`) to view the slides.
- Slides include annotated code excerpts for LinkedList, Queue, BST, RandomSumPairs, and Employee classes. The slide author signature appears at the bottom-right and the first slide notes the author.

## Table of Contents

- [Lab00 – Basic Classes](Lab00/README.md)
- [Lab01 – Arrays](Lab01/README.md)
- [Lab03 – Simple Example](Lab03/README.md)
- [Lab04 – Exercises](Lab04/README.md)
- [Lab05 – Exercise 1](Lab05/README.md)
- [Lab06 – Exercise 1](Lab06/README.md)
- [Lab07 – Exercise 1](Lab07/README.md)
- [Lab08 – ArrayList Examples](Lab08/README.md)
- [Lab09 – ArrayList Example](Lab09/README.md)
- [Lab10 – Exercise 6](Lab10/README.md)
- [Lab11 – Linked List Example](Lab11/README.md)
- [Lab12 – Linked List Iterator Examples](Lab12/README.md)
- [Lab13 – Stack Examples](Lab13/README.md)
- [Lab14 – Stack Examples](Lab14/README.md)
- [Lab15 – Queue Example](Lab15/README.md)
- [Lab16 – Binary Search Tree](Lab16/README.md)
- [Assignment2 – Random Sum Pairs](Assignment2/README.md)
- [RevisionLabTest – Data Structure Implementations](RevisionLabTest/README.md)
- [RevesionMajorTest – Sorting Algorithms](RevesionMajorTest/README.md)

## Running the examples

All source files are plain Java programs with a `public static void main(String[] args)` entry point. To compile and run an example:

```bash
# From the repository root (or the specific lab folder)
javac -d out $(find . -name "*.java")
java -cp out RevisionLabTest.LinkedList
```

To quickly view the slides locally:

```bash
# using Python's simple HTTP server (serves current directory on port 8000)
python -m http.server 8000
# then open http://localhost:8000/index.html in your browser
```

No external libraries are required to compile the Java examples.
