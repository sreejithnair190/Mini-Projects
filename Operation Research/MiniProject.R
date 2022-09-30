library(lpSolve)

costs <- matrix(c(53, 76, 75, 0,
                  42, 62, 65, 0,
                  85, 100 , 78, 0), nrow = 3, byrow = TRUE)

colnames(costs) <- c("Destination 1", "Destination 2", "Destination 3", "Destination 4")
rownames(costs) <- c("Supplier 1", "Supplier 2", "Supplier 3")

row.signs <- rep("<=", 3)
row.rhs <- c(7, 5, 4)
col.signs <- rep(">=", 4)
col.rhs <- c(3, 4, 6, 3)

TotalCost <- lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)

lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)$solution
print(TotalCost)
