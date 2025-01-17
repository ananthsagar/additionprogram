pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                // Clone the Git repository
                git branch: 'main', url: 'https://github.com/username/AdditionProject.git'
            }
        }
        stage('Compile') {
            steps {
                // Compile the Java program
                sh 'javac src/com/example/Addition.java'
            }
        }
        stage('Run') {
            steps {
                // Execute the Java program with inputs
                script {
                    def num1 = input message: 'Enter the first number:', parameters: [string(name: 'NUM1')]
                    def num2 = input message: 'Enter the second number:', parameters: [string(name: 'NUM2')]

                    sh "echo ${num1} ${num2} | java -cp src com.example.Addition"
                }
            }
        }
    }
}
