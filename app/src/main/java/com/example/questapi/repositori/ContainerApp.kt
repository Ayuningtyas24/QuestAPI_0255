package com.example.questapi.repositori

interface ContainerApp {
    val repositoryDataSiswa : RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp {
    private val baseurl = "http://10.0.2.2/umyTI/"
}