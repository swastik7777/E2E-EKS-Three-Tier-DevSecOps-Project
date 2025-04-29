script {
    def repositoryUri = "${env.AWS_ACCOUNT_ID}.dkr.ecr.${env.AWS_DEFAULT_REGION}.amazonaws.com/${env.AWS_ECR_REPO_NAME}"
    sh """
        aws ecr get-login-password --region ${env.AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${repositoryUri}
        docker tag ${env.AWS_ECR_REPO_NAME} ${repositoryUri}:${BUILD_NUMBER}
        docker push ${repositoryUri}:${BUILD_NUMBER}
    """
}
