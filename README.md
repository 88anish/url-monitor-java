# 🌐 Scalable URL Monitoring & Alerting Service

A production-ready URL monitoring and alerting system built using **Java (Spring Boot)**. Users can register and authenticate, add URLs to be monitored, and receive **email alerts** if any of their URLs become unreachable. The system performs concurrent health checks, tracks metrics, and supports containerized deployment.

---

## 🚀 Features

- ✅ User registration & JWT-based login
- 🔐 Secure REST APIs with token-based authentication
- 🌍 Periodic URL health checks (every X seconds)
- 📬 Email alerts on downtime
- ⚙️ Scalable architecture using concurrent task execution
- 📊 Observability using Spring Boot Actuator (Prometheus-ready)
- 🐳 Docker + Docker Compose for containerization
- 🧪 Postman collection for API testing

---

## 🧱 Tech Stack

| Layer          | Technology          |
|----------------|---------------------|
| Language       | Java 17             |
| Framework      | Spring Boot         |
| Authentication | JWT                 |
| Database       | PostgreSQL          |
| Email Service  | Spring Mail         |
| Scheduling     | Spring Scheduler + ExecutorService |
| Metrics        | Spring Actuator     |
| Containerization| Docker, Docker Compose |
| API Testing    | Postman             |

---

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/url-monitor-java.git
cd url-monitor-java
