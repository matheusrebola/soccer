package soccervs.persistence.formacao.core.dtos;

import java.time.LocalDateTime;

public class History {

	private String source;
	private ESagaStatus status;
	private String message;
	private LocalDateTime createdAt;

	public History(String source, ESagaStatus status, String message, LocalDateTime createdAt) {
		this.source = source;
		this.status = status;
		this.message = message;
		this.createdAt = createdAt;
	}

	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private History(Builder builder) {
        this.source = builder.source;
        this.status = builder.status;
        this.message = builder.message;
        this.createdAt = builder.createdAt;
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ESagaStatus getStatus() {
		return status;
	}

	public void setStatus(ESagaStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public static class Builder {
        private String source;
        private ESagaStatus status;
        private String message;
        private LocalDateTime createdAt;

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder status(ESagaStatus status) {
            this.status = status;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public History build() {
            return new History(this);
        }
    }

    // Método estático para inicializar o builder
    public static Builder builder() {
        return new Builder();
    }
}
