package contracts

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "Ordering Contract"
    request {
        method GET()
        url("/payment") {
            queryParameters {
                parameter("userID", "1")
                parameter("price", "250")
            }
        }
    }
    response {
        body("success")
        status 200
    }
}