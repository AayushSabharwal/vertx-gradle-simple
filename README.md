# Vert.x 3.1 Simplest Gradle Project

This is simple Hello World Vert.x 3.1 project using the Gradle build system. It initializes a simple HTTP server which
simply returns "Hello World!" with every request.

In this example, Vert.x is used in an embedded fashion. It uses Vert.x APIs directly in its classes rather than
deploying code in verticles.



## Setting up the project

1. *Fork* this git repository and *clone* the fork to a local directory [(Reference)](https://guides.github.com/introduction/git-handbook)

###### If not using an IDE, skip steps 2 and 3

2. If you prefer using an IDE, install [Intellij IDEA](https://www.jetbrains.com/idea) or another preferred IDE
3. Import the cloned repository into your IDE



## Running the app

###### If using an IDE like Intellij IDEA,

1. Right click the **HelloWorldEmbedded** class
2. Click **Run as...**

###### Alternatively,

Directly run the application using the gradle plugin with **./gradlew run**



## Viewing the app after running it

Visit **http://localhost:8080** on your browser



## Contributing to the project

1. Make your intended changes on your locally cloned repository
2. *Commit* the changes and *push* the commit to your forked repository on GitHub
3. Ensure the changes on the commit pushed to your GitHub fork are right
4. Create a *pull request* requesting to merge the commits on your fork to this repository [(Reference)](https://guides.github.com/introduction/flow)
5. Write a concise and convincing pull request message explaining the purpose of your commits!
