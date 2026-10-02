Java_app/
│
├── pom.xml
├── Dockerfile
│
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── demo/
                        ├── DemoApplication.java
                        └── HomeController.java



pom.xml
   ↓
Maven builds Java application
   ↓
JAR
   ↓
Dockerfile
   ↓
Docker builds container image
   ↓
Kubernetes YAML
   ↓
Kubernetes runs containers

Install helm:
curl https://raw.githubusercontent.com/helm/helm/main/scripts/get-helm-3 | bash


kubectl create namespace argocd
kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
kubectl get pods -n argocd

kubectl port-forward --address=0.0.0.0 svc/argocd-server -n argocd 9090:443

kubectl -n argocd get secret argocd-initial-admin-secret \
  -o jsonpath="{.data.password}" | base64 -d
echo

minikube service java-app --url
