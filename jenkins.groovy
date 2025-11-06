pipeline{
    agent any
    stages{
        stage("Clone From Github"){
            steps{
                git clone 
            }
        }
        stage("Permission - Step 2"){
            steps{
                sh 'chown -R jenkins:jenkins /var/www/html'
            }
        }
        stage("delete the dir file"){
            steps{
                sh 'rm -rf /var/www/html/*'
            }
        }
        stages("copy to html dir"){
            steps{
                sh 'cp -r * /var/www/html'
            }
        }
    }
}



//  manage plugins
// generacik webhook trigger
// github integration
// On thr github 
// payload URL
// ip/github-webhook 
// content application json ''