-- 1-1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
--    �÷��� : email(pk) / pw / tel / address
--      ������Ÿ�� : varchar2(100)
CREATE TABLE web_member(EMAIL VARCHAR2(100),
                                        PW VARCHAR2(100),
                                        TEL VARCHAR2(100),
                                        ADDRESS VARCHAR2(100)
);
-- 1-2. test�� �ֱ�
INSERT INTO web_member VALUES('TEST','TEST','TEST','TEST');
-- 1-3. test�� ��ȸ�ϱ�
SELECT * 
FROM web_member;

-- 2-1. �޽��� ������ ������ �� �ִ� 'web_message'���̺��� ����ÿ�.
-- �÷��� : num(pk)/ sendName / receiveEmail / message/ m_date
-- ������Ÿ�� : number / varchar2(100) / date

-- 2-2. num�� �Է��� ������ ���� : num_message

-- 2-3. test�� �ֱ�

-- 2-4. test�� ��ȸ�ϱ�


-- 3-1. �Խñ� ������ ������ �� �ִ� 'web_board' ���̺��� ����ÿ�
-- �÷��� : num(pk)/ title / writer/ filename / content / b_date
-- ������Ÿ�� : number / varchar2(100) / date

-- 3-2. num�� �Է��� ������ ���� : num_board

-- 3-3. test�� �ֱ�

-- 3-4. test�� ��ȸ�ϱ�


