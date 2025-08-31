# Data Structure Java Course

Comprehensive collection of Java exercises and small projects used for a college-level Data Structures course. The repository contains handwritten implementations and examples intended for learning, teaching, and quick experimentation.

Live slides: https://imythms.github.io/data-structure-java/

## Contents

- Lab00..Lab16 — course labs covering basic classes, arrays, lists, stacks, queues, trees, and more.
- Assignment2 — RandomSumPairs example using Java Collections.
- RevisionLabTest — manual implementations: LinkedList, DoublyLinkedList, Queue, Node, etc.
- RevesionMajorTest — sorting and search algorithms (bubble, insertion, selection, binary search).
- index.html — Reveal.js slide deck (annotated code excerpts and explanations). Open with a local static server or use the deployed link above.

## How to build & run examples

All code is plain Java (no external dependencies). From the repository root:

1) Compile all Java sources into an output directory:

```bash
javac -d out $(find . -name "*.java")
```

2) Run a single example (replace with desired fully-qualified class name):

```bash
java -cp out RevisionLabTest.LinkedList
```

3) Or compile and run a single file in its folder:

```bash
cd Lab01
javac Exercise0.java && java Exercise0
```

## View the slides locally

Serve the repo directory with a local static file server and open `index.html`:

```bash
python -m http.server 8000
# then open http://localhost:8000/index.html
```

Or use VSCode Live Server or similar.

## Notes & recommendations

- Prefer java.util.Scanner(System.in) for console input in IDEs; System.console() may be null.
- Some custom classes expose fields directly (e.g., LinkedList.head). Treat these as learning samples and prefer encapsulation in production code.
- Consider adding unit tests (JUnit) and a build workflow (Maven/Gradle) if you plan to extend this repository.

## Contributing

Small fixes and documentation improvements are welcome. Fork, make changes, and open a pull request.

## License & contact

This repository is personal course material. For questions or suggestions contact: hello@mytham.me
