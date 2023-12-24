CREATE TABLE teacher (
                         t_id INT PRIMARY KEY AUTO_INCREMENT,
                         t_name VARCHAR(20) );
CREATE TABLE class (
                       c_id INT PRIMARY KEY AUTO_INCREMENT, c_name VARCHAR(20),
                       teacher_id INT
);

ALTER TABLE class ADD CONSTRAINT fk_teacher_id FOREIGN KEY (teacher_id) REFERENCES teacher(t_id);

INSERT INTO teacher(t_name) VALUES('LS1');
INSERT INTO teacher(t_name) VALUES('LS2');
INSERT INTO class(c_name, teacher_id) VALUES('bj_a', 1);
INSERT INTO class(c_name, teacher_id) VALUES('bj_b', 2);

CREATE TABLE `dept` (
    `deptno` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    `dname` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    `loc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`deptno`)
    USING BTREE)
    ENGINE = InnoDB AUTO_INCREMENT = 54
    CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `dept` VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO `dept` VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO `dept` VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO `dept` VALUES (40, 'OPERATIONS', 'BOSTON');

DROP TABLE IF EXISTS `emp`; CREATE TABLE `emp` (
   `empno` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
   `ename` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
   `job` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
   `mgr` int(10) UNSIGNED NULL DEFAULT NULL, `hiredate` date NULL DEFAULT NULL,
   `sal` decimal(7, 2) NULL DEFAULT NULL,
   `comm` decimal(7, 2) NULL DEFAULT NULL, `deptno` int(10) UNSIGNED NULL DEFAULT NULL, PRIMARY KEY (`empno`) USING BTREE,
   INDEX `deptno`(`deptno`) USING BTREE,
   CONSTRAINT `emp_ibfk_1` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7935 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `emp` VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20);
INSERT INTO `emp` VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30);
INSERT INTO `emp` VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30);
INSERT INTO `emp` VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20);




